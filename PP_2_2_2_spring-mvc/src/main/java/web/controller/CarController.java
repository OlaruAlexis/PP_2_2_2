package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDAO;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String showAllCars(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "show_all_cars";
    }

    @GetMapping("/{count}")
    public String showSomeCars(@PathVariable("count") int count, Model model) {
        model.addAttribute("someCars", carService.showSomeCar(count));
        return "show_some_cars";
    }
}
