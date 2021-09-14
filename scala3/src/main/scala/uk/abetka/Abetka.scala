package uk.abetka

object Abetka:
  private val sL  = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz``'’"
  private val sLd = "AEGIUaegiu"
  private val sK  = "АБЦДЕФГХІЖКЛМНОПЧРСТУВЩШИЗабцдефгхіжклмнопчрстувщшизьЬййЯЄҐЇЮяєґїю"

  def toLatin(baseText: String): String =
    val targetText = new StringBuilder()
    baseText.foreach { ch =>
      val baseIndex = sK.indexOf(ch)
      if baseIndex >= 0 && baseIndex <= 55 then
        targetText append sL.charAt(baseIndex)
      else if baseIndex > 55 then
        targetText append sL.charAt(54)
        targetText append sLd.charAt(baseIndex - 56)
      else 
        targetText append ch
    }
    targetText.toString()

  def toCyrillic(baseText: String): String =
    val targetText = new StringBuilder()
    var f = 0
    baseText.foreach { ch =>
        val baseIndex = sL.indexOf(ch)
        if baseIndex > 53
        then
          f += 1
        else
          val baseIndex2 = sLd.indexOf(ch)
          val targetChar = if baseIndex > -1 then sK.charAt(baseIndex) else ch

            if f == 0 then
              targetText append targetChar
            else if f == 1 && baseIndex2 == -1 then
              targetText append 'й'
              targetText append targetChar
            else if f == 1 then
              targetText append sK.charAt(baseIndex2 + 56)
            else if f == 2 then
              targetText append sL.charAt(54)
              targetText append sK.charAt(baseIndex2 + 56)
            f = 0
    }

    if f == 1 then targetText append 'й'

    targetText.toString()
