package p1tt187.doc2text.extractor

import java.io.FileInputStream

/**
  * @author fabian 
  *         on 07.11.15.
  */
object ExtractorChooser {
  def apply( fileInputStream: FileInputStream ):TExtractor={
    try {
      new WExtractor(fileInputStream)
    } catch {
      case _: Exception =>
        new W6Extractor(fileInputStream)
    }
  }
}
