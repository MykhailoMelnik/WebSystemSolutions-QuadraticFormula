package com.сalculation.controller;

import com.сalculation.entity.Coefficients;
import com.сalculation.service.CoefficientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {
    @Autowired
    private CoefficientService coefficientService;

    @RequestMapping("/")
    public String askingCoefficient(Model model) {
        Coefficients coefficients = new Coefficients();
        model.addAttribute("coefficients", coefficients);
        return "asking-coefficient";
    }

    @RequestMapping("/showResult")
    public String showResult(@Valid @ModelAttribute("coefficients") Coefficients coefficients,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "asking-coefficient";
        } else {
            coefficients.calculateQuadraticFormula();
            coefficientService.saveCoefficient(coefficients);
            return "show-result";
        }
    }

    @RequestMapping("return")
    public String returnFirstView() {
        return "redirect:/";
    }
}
