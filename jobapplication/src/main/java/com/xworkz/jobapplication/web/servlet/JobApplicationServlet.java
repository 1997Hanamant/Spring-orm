package com.xworkz.jobapplication.web.servlet;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jobapplication.dto.JobApplicationDTO;

@WebServlet(loadOnStartup = 3, urlPatterns = "/Job")
public class JobApplicationServlet extends HttpServlet {
	java.util.List<JobApplicationDTO> dto = new ArrayList<JobApplicationDTO>();

	public JobApplicationServlet() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	@Override
	protected void service(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method running in JobApplicationServlet");
		resp.setContentType("text/html");

		String name = res.getParameter("ApplicantName");
		String email = res.getParameter("ApplicantEmail");
		String phoneNo = res.getParameter("ApplicantPhoneNo");
		String alternatPhoneNo = res.getParameter("ApplicantAlternativePhoneNo");
		String gender = res.getParameter("ApplicantGender");
		String qualification = res.getParameter("ApplicantQualification");
		String yop = res.getParameter("ApplicantYop");
		String university = res.getParameter("ApplicantUniversity");
		String address = res.getParameter("ApplicantAdress");
		String names=" ";
		String[] skill = res.getParameterValues("ApplicantSkill");
		if(skill!=null) {
		for (String string : skill) {
			System.out.println(string);
		}
		}
		
		String salary = res.getParameter("ApplicantSalary");
		String experince = res.getParameter("ApplicantExperince");
		String idProof = res.getParameter("ApplicantIdProof");
		String idProofNumber = res.getParameter("ApplicantIdProofNumber");

		System.out.println("name" + name);
		System.out.println("Eamil" + email);
		System.out.println("phoneNo" + phoneNo);
		System.out.println("alternatPhoneNo" + alternatPhoneNo);
		System.out.println("gender" + gender);
		System.out.println("qualification" + qualification);
		System.out.println("yop" + yop);
		System.out.println("university" + university);
		System.out.println("address" + address);
		System.out.println("skill" + skill);
		System.out.println("address" + salary);
		System.out.println("experince" + experince);
		System.out.println("qualification" + idProof);
		System.out.println("idProofNumber" + idProofNumber);

		PrintWriter writer = resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1>").append("Job Application").append("</h1>")
				.append("</br>").append("name").append(name).append("</br>").append("eamil").append(email)
				.append("</br>").append("phoneNo").append(phoneNo).append("</br>").append("alternatPhoneNo")
				.append(alternatPhoneNo).append("</br>").append("gender").append(gender).append("</br>")
				.append("qualification").append(qualification).append("</br>").append("yop").append(yop).append("</br>")
				.append("university").append(university).append("</br>").append("address").append(address)
				.append("skill").append(names).append("</br>").append("salary").append(salary)
				.append("</br>").append("experince").append(experince).append("</br>").append("idProof").append(idProof)
				.append("</br>").append("idProofNumber").append(idProofNumber).append("</br>").append("</body>")
				.append("</html>");

		JobApplicationDTO dtos = new JobApplicationDTO(name, email, Long.parseLong(phoneNo),
				Long.parseLong(alternatPhoneNo), gender, qualification, Integer.parseInt(yop), university, address,
				skill, Double.parseDouble(salary), experince, idProof, Long.parseLong(idProofNumber));
		boolean add = dto.add(dtos);
		System.out.println(add);
	
	}
}
