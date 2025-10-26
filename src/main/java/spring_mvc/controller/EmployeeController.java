package spring_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring_mvc.dao.EmployeeDao;
import spring_mvc.dto.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	@RequestMapping("/ae")
	@ResponseBody
	public String addEmp() {
		
		return "Employee added";
	}
	@RequestMapping("/insert")
	@ResponseBody
	public String insertEmp(@ModelAttribute Employee employee) {
		System.out.println(employee);
		String msg=employeeDao.insert(employee);
		return msg;
		
	}
	@RequestMapping("/fid")
	@ResponseBody
	public void fetchEmp(Employee employee) {
         Object obj = employeeDao.findById(employee.getId()); 
          System.out.println(obj);
	}
	@RequestMapping("/did")
	@ResponseBody
	public ModelAndView deleteid(Employee employee) {
		String msg =employeeDao.delbyId(employee.getId());
		List<Employee> list = employeeDao.fetchall();
		ModelAndView view=new ModelAndView();
		view.addObject("k",list);
		view.setViewName("fechtall.jsp");
		return view; 
	}
	
	@RequestMapping("/fall")
	@ResponseBody
	public /* List<Player> */ ModelAndView fall(Employee employee) {
		List<Employee> list = employeeDao.fetchall();
		ModelAndView view=new ModelAndView();
		view.addObject("k",list);
		view.setViewName("fechtall.jsp");
		return view; 
	}
	/*
	 * public List<Employee> fetchall(Employee employee){ List<Employee>
	 * list=employeeDao.fetchall(); return list;
	 * 
	 * }
	 */
	@RequestMapping("/dall")
	@ResponseBody
	public String deleteall(Employee employee) {
		String msg =employeeDao.deleteAll();
		return msg;
		
	}

	@GetMapping("/u")
	@ResponseBody
	public String update(@ModelAttribute Employee employee) {
		System.out.println(employee);
		String msg=employeeDao.update(employee);
		return msg;
		
	}
} 
