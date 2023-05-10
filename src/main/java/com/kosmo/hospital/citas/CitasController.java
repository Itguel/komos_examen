package com.kosmo.hospital.citas;

import com.kosmo.hospital.service.ConsultorioService;
import com.kosmo.hospital.service.DoctorService;
import com.kosmo.hospital.views.HospitalViews;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class CitasController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private ConsultorioService consultorioService;

    @RequestMapping(value = "/citas", method = RequestMethod.GET)
    public ModelAndView registrarCita(Model model){
        model.addAttribute("doctores",doctorService.getAllDoctors());
        model.addAttribute("consultorios",consultorioService.getConsultorios());
        return new ModelAndView(HospitalViews.CITAS_MAIN);
    }
}
