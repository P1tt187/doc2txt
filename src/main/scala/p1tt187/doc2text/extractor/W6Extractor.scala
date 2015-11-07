package p1tt187.doc2text.extractor

import java.io.FileInputStream

import org.apache.poi.hwpf.extractor.Word6Extractor

/**
  * @author fabian 
  *         on 07.11.15.
  */
class W6Extractor(fileInputStream: FileInputStream) extends TExtractor{

  private val word6Extractor = new Word6Extractor(fileInputStream)

  override def close: Unit = {word6Extractor.close()}

  override def getText: String = {
    word6Extractor.getText
  }
}
