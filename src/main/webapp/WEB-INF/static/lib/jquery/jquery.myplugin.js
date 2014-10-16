(function($){
    var defaults = {
        id: "s1",
        splitStr: "-"
    };
    var opts = {};
    var methods = {
        init: init,
        getValue: function getSelectValue() {
            var selects = $(this).find('select');
            var value = "";
            selects.each(function() {
                if ($(this).val()) {
                    value += $(this).val() + opts.splitStr;
                }
            });
            return value.substr(0, value.length - 1);
        },
        setValue: function setValue(defaultValue) {
            var valArr = defaultValue.split(opts.splitStr);
            for (var i = 0, vLen = valArr.length; i < vLen; i++) {
                var selects = $(this).find('select');
                $(selects[i]).val(valArr[i]);
                $(selects[i]).trigger("change");
            }
        }
    };
    $.fn.MultipleLevelSelector = function(method) {
        // Method calling logic
        if (methods[method]) {
              return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));
        } else if ( typeof method === 'object' || ! method ) {
              return methods.init.apply(this, arguments);
        } else {
              $.error( 'Method ' +  method + ' does not exist on jQuery.MultipleLevelSelector' );
        }
    };
    function appendOptions(target, id, selJson) {
        if (id) {
            var $sel = $("#" + id);
            if ($sel.size() === 0) {
                $(target).append($("<select></select>", {
                    "id":id
                }));
                $sel = $("#" + id);
            } else {
                $sel.empty();
            }
            if (selJson.hasOwnProperty("next")) {
                $sel.on("change", function() {
                    $("#" + id + " ~ select").remove();
                    appendOptions(target, selJson.next.id, selJson.next.opts[$(this).has(":selected").val()]);
                });
                $sel.show();
                for (var i in selJson.next.opts) {
                    $sel.append(new Option(selJson.next.opts[i].name, i));
                }
                if (selJson.next.hasOwnProperty("id") && selJson.next.hasOwnProperty("opts") && selJson.next.opts[$sel.has(":selected").val()]) {
                    appendOptions(target, selJson.next.id, selJson.next.opts[$sel.has(":selected").val()]);
                }
            } else {
                $sel.hide();
            }
        }
    }
    function init(options) {
        opts = $.extend(defaults, options);
        appendOptions(this, options.id, options.selJson);
    }
})(jQuery);