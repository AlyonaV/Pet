package mvc.controller.owner;

import mvc.persistence.dto.PositionDTO;
import org.joda.time.LocalDate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerJournalController {

//    @RequestMapping(value = "/deviceActivity/", method = RequestMethod.GET)
//    public ResponseEntity<List<PositionDTO>> deviceActivity(@RequestParam("deviceId") Integer deviceId,
//                                                            @RequestParam("dateStart") LocalDate dateStart,
//                                                            @RequestParam("dateFinish") LocalDate dateFinish)
}
