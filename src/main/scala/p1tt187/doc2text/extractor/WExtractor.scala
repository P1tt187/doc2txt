package p1tt187.doc2text.extractor

import java.io.FileInputStream

import org.apache.poi.hwpf.extractor.WordExtractor

/**
  * @author fabian 
  *         on 07.11.15.
  */
class WExtractor(fileInputStream: FileInputStream)  extends TExtractor{

  private val wordExtractor: WordExtractor = new WordExtractor(fileInputStream)

  override def close: Unit = {
    wordExtractor.close()
  }

  override def getText: String = {
    wordExtractor.getText
  }
}
