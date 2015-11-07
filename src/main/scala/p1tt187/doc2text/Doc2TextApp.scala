package p1tt187.doc2text

import java.io.{File, FileInputStream, FileNotFoundException, FileOutputStream}
import java.util.Formatter

import p1tt187.doc2text.extractor.ExtractorChooser

/**
 * @author fabian 
 *         on 18.10.15.
 */
object Doc2TextApp extends App {

  val results = args.map { arg =>
    try {
      val wordExtractor = ExtractorChooser(new FileInputStream(arg))
      val tmpFile = File.createTempFile(arg, ".txt")
      val output = new Formatter(new FileOutputStream(tmpFile))
      output.format("%s", wordExtractor.getText)
      output.flush()
      output.close()
      wordExtractor.close
      tmpFile.getAbsolutePath
    } catch {
      case ex: FileNotFoundException =>
        println(ex.getMessage)
        System.exit(1)
      case ex: Exception =>
        println("not a valid doc file " + ex.getMessage)
        System.exit(1)
    }
  }
  println(results.mkString(" "))
}
