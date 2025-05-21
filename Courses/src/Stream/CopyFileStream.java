// package Stream;

// //program for copying the data of two file in a single file
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.SequenceInputStream;
// //import java.io.FileNotFoundException;
// //import java.io.IOException;

// public class CopyFileStream {
//  public static void main(String[] args) throws Exception{
//      try(FileInputStream fos=new FileInputStream("test.txt");
//          FileInputStream fos2=new FileInputStream("test2.txt");
//      ){
//          SequenceInputStream fos3= new SequenceInputStream(fos, fos2);
// above lines ensure that first argument file will be read first and second afterwards
//          FileOutputStream CopiedFile= new FileOutputStream("CopiedContent.txt");
//          int x;
//          while((x=fos3.read())!=-1){
//              CopiedFile.write((char)x);
//          }
//          CopiedFile.close();
//      }

//  }
// }

