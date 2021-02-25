package nl.tilburg.Dbdemo.controller;

import nl.tilburg.Dbdemo.model.Name;
import nl.tilburg.Dbdemo.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @author Stefan van Tilburg
 */
@Controller
public class NameController {

    private NameRepository nameRepository;

    @Autowired
    public NameController(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    @GetMapping("/")
    protected String defaultPage(Model model) {
        Name name = new Name("Stefan");
        model.addAttribute("demoName", name);
        return "defaultPage";
    }

    @GetMapping("/name/{id}")
    protected String getNameOf(Model model, @PathVariable("id") int id) {
        Optional<Name> getNameOfId = nameRepository.findById(id);

        if (getNameOfId.isPresent()) {
            model.addAttribute("demoName", getNameOfId.get());
        } else {
            model.addAttribute("demoName", new Name("Name not found!"));
        }
        return "defaultPage";
    }
}
