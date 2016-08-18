package xirui.CoreJavaVolume.ch01.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Administrator on 16-4-9.
 */
public class TestFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\1");
        Files.walkFileTree(path, new SimpleFileVisitor<Path>()
        {
            public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException
            {
                  System.out.println(path);
                  return FileVisitResult.CONTINUE;
            }

            public FileVisitResult VisitFileFailed(Path path, IOException exc) throws IOException
            {
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
