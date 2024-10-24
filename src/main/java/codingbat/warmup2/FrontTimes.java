package codingbat.warmup2;

import java.io.StringWriter;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        StringWriter result = null;
        if (str.length() >= 3){
          result.append(str.substring(0,3));
      } else {
          result.append (str);
      }
      return result.toString();
    }
}
