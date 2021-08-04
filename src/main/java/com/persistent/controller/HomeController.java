package com.persistent.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.persistent.entities.DoctorInfo;
//import com.persistent.entities.Patient;
//import com.persistent.entities.User;
//import com.persistent.service.DoctorService;
//import com.persistent.service.PatientService;
//import com.persistent.service.UserService;

@Controller
public class HomeController {
	
//	@Autowired
//	private DoctorService dserv;
//	
//	@Autowired
//	private PatientService pserv;
//	
//	@Autowired
//	private UserService userv;
//	
//	public HomeController() {
//	}

//	@RequestMapping({"/","/home"})//  src/main/webapp/views/home.jsp will be called
//	public String home()
//	{
//		return "mainpage";
//	}

	
	
	@GetMapping({"/","/login"})
	public String login()
	{
		return "login";
	}
	@GetMapping({"/patientreg"})
	public String patientreg()
	{
		return "patientreg";
	}
	@GetMapping({"/docprofile"})
	public String docprofile()
	{
		return "docprofile";
	}

	@GetMapping({"/patienthome"})
	public String patienthome()

	{
		return "patienthome";
	}
	@GetMapping({"/about"})
	public String about()
	{
		return "about";
	}
	@GetMapping({"/admin"})
	public String admin()
	{
		return "admin";
	}
	@RequestMapping({"/doctorreg"})
	public String doctorreg()
	{
		return "doctorreg";
	}
		
//	
//	@RequestMapping("/patient_signup")
//	public String user_signup()
//	{
//		return "patient_signup";
//	}
//	
//	

	
	
	
//	@RequestMapping("/login_user")
//	public String login_user(@ModelAttribute User u,Model m)
//	{
//		
//		if((userv.getUserByUser_NameAndPassword(u.getUser_name(), u.getPassword()))!=null)
//		{
//			System.out.println(u);
//			if((u.getType()).equals("doctor")) 
//			{
//				System.out.println("Doctor Service Called");
//				DoctorInfo d1 =dserv.findDoctorByUser_Name(u.getUser_name());
//				if(d1!= null) {
//					System.out.println(d1);
//					m.addAttribute("doc", d1);
//					return "doctor_home";
//					
//				}
//				else 
//					return "error";
//				
//			}
//			else
//			{
//				if((u.getType()).equals("patient"))
//				{
//					System.out.println("Patient Service Called");
//					Patient p1 =pserv.findPatientByUser_Name(u.getUser_name());
//					if(p1 != null) {
//						System.out.println(p1);
//						m.addAttribute("pat", p1);
//						return "patient_home";
//						
//					}
//					else 
//						return "error";
//				}
//				else
//					return "error";
//		     }
//		
//		}
//		else
//			return "error";
//		
//	}
//
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public DoctorService getDserv() {
//		return dserv;
//	}
//
//	public void setDserv(DoctorService dserv) {
//		this.dserv = dserv;
//	}
//
//	public PatientService getPserv() {
//		return pserv;
//	}
//
//	public void setPserv(PatientService pserv) {
//		this.pserv = pserv;
//	}
//	
//	
//	

}
