package fnjsw.util;

import java.io.File;

public class CommonUtils {
    private static String fileUploadDirectory = "D:/uploads";

    public static File getFPCDir(int ocaId) {
        File dir =
                new File(fileUploadDirectory + File.separator + ocaId
                        + File.separator + "FPC");
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File getFPCFile(int ocaId, String filename) {
        File file =
                new File(fileUploadDirectory + File.separator + ocaId
                        + File.separator + "FPC"
                        + File.separator
                        + filename);
        if (file.isFile()) {
            return file;
        }
        return null;
    }

    public static File getZSZDir(int ocaId) {
        File dir =
                new File(fileUploadDirectory + File.separator + ocaId
                        + File.separator + "ZSZ");
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File getZSZFile(int ocaId, String filename) {
        File file =
                new File(fileUploadDirectory + File.separator + ocaId
                        + File.separator + "ZSZ"
                        + File.separator
                        + filename);
        if (file.isFile()) {
            return file;
        }
        return null;
    }
}
