package mvc.controller;

import mvc.persistence.dto.Tk103SentenceDTO;
import mvc.protocol.TK103Protocol;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("")
public class TrackerController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void listAllUsers(@RequestBody String gotMessage) {
        System.out.println("msse");
//        Logger.getLogger(getClass().getName()).log(Level.INFO,
//                "MSG from device:{0}", gotMessage);
//        TK103Protocol protocol = new TK103Protocol();
//
//        try {
//            Tk103SentenceDTO tk103SentenceDTO = protocol.ParseSentence(gotMessage);
//            System.out.println(tk103SentenceDTO.toString());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
