package com.example.springWebDemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
    @RequestMapping("/") //it gives jsp file in case of this but to convert jsp file to servlet
    //add tomcat server dependency.
    public String home(){
       // return "index.jsp";
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//
//        int n1= Integer.parseInt(req.getParameter("num1"));
//        int n2= Integer.parseInt(req.getParameter("num2"));
//        int res=n1+n2;
//        System.out.println(res);
//        session.setAttribute("result",res);
//        System.out.println("add method");
//        return "result.jsp";
//    }


//    @RequestMapping("add")
//    public String add(int num1, @RequestParam("num2") int n2, Model model){
//       // by using @requestParam annotation we can change the varible name other than
//        //the name which is in corresponing jsp file
//        //without requestparam it shoul be of same name as in corresponding jsp file.
//        int res=num1+n2;
//        System.out.println(res);
////        session.setAttribute("result",res);
//        model.addAttribute("result",res);
//        System.out.println("add method");
////        return "result.jsp";
//        return "result";
//    }

//@RequestMapping("add")
//public ModelAndView add(int num1, @RequestParam("num2") int n2, ModelAndView mv){
//    int res=num1+n2;
//
//    mv.addObject("rest",res);
//    mv.setViewName("result");
//
//    return mv;
//
//}
//
//    @RequestMapping("//")
//    public String humandetails(){
//        return "human";
//    }
//
////    @RequestMapping("addhuman")
////    public ModelAndView addhuman(int hid, @RequestParam("hname") String hn, ModelAndView mv){
//    @RequestMapping("addhuman")
//    public String addhumans( Human human){
////    Human human=new Human();
////    human.setId(hid);
////    human.setName(hn);
////    mv.addObject("hum",human);
////    mv.setViewName("human_out");
//    return "human_out.jsp";
//}
//    @ModelAttribute("course")
//    public String CourseName(){
//              return "java";
//    }





}
