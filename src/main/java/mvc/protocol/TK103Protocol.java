package mvc.protocol;

import mvc.persistence.dto.Tk103SentenceDTO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Alona on 25.05.2016.
 */
public class TK103Protocol {
    DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");

    public Tk103SentenceDTO ParseSentence(String input) throws ParseException {
        Tk103SentenceDTO sentenceDTO = new Tk103SentenceDTO();

        String[] parts = input.split(",");

        sentenceDTO.setValid("A".equals(parts[4]));

        String ts = parts[11] + parts[3].substring(0,6);
//        sentenceDTO.setTimestamp(format.parse(ts));

        sentenceDTO.setLatG(Integer.parseInt(parts[5].substring(0,1)));
        sentenceDTO.setLatM(Integer.parseInt(parts[5].substring(2, 3)));
        sentenceDTO.setLatmm(Integer.parseInt(parts[5].substring(5, 9)));

        sentenceDTO.setLonG(Integer.parseInt(parts[7].substring(0,2)));
        sentenceDTO.setLonM(Integer.parseInt(parts[7].substring(3, 4)));
        sentenceDTO.setLonMm(Integer.parseInt(parts[7].substring(6, 10)));

        sentenceDTO.setSpeed(Double.parseDouble(parts[9]));
        sentenceDTO.setCourse(Double.parseDouble(parts[10]));
        sentenceDTO.setAltitude(Double.parseDouble(parts[19]));

        sentenceDTO.setSignalLevel("F".equals(parts[15]) ? 1d : 0d);
        sentenceDTO.setFixCount(Integer.parseInt(parts[18]));
        sentenceDTO.setBatteryLevel(Double.parseDouble(parts[20].substring(2).replaceAll("V","")));
        sentenceDTO.setCharging("1".equals(parts[21]));

        sentenceDTO.setImei(parts[17].split(":")[1]);
        return sentenceDTO;
    }
}
