package oslomet.motorvognregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MotorvognRegisterController {
    public final List<Motorvogn> motorvognList = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreBil(Motorvogn enMotorvogn){
        motorvognList.add(enMotorvogn);
    }

    @GetMapping("/listAlle")
    public List<Motorvogn> hentAlle() {
        return motorvognList;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        motorvognList.clear();
    }
}
