package mvc.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("")
public class TrackerController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void listAllUsers() {
        System.out.println("mssePOST");
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

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void listAllUsersGET(@RequestParam int id, @RequestParam Date timestamp,
                                @RequestParam float lat, @RequestParam float lon,
                                @RequestParam float speed, @RequestParam float bearing,
                                @RequestParam float altitude, @RequestParam float batt) {
        System.out.println("msseGET");
    }

}
