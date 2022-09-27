package com.xworkz.companydetails.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.companydetails.dto.CompanyDetailsDTO;

@WebServlet(loadOnStartup = 5, urlPatterns = { "/company", "/showdeatils" })
public class CompanyDetailsServlet extends HttpServlet {
    List<CompanyDetailsDTO> companyDetailsDTOs=new ArrayList<CompanyDetailsDTO>();
    
	public CompanyDetailsServlet() {
		System.out.println(this.getClass().getSimpleName() + "is created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Calling doPost Method");
		
		resp.setContentType("text/html");
		String name = req.getParameter("company name");
		String founderName=req.getParameter("founder name");
		String since=req.getParameter("company since");
		String employes=req.getParameter("company Employes");
		String address=req.getParameter("company address");
		String business =req.getParameter("company business");
		
		System.out.println("name"+" "+name);
		System.out.println("foundername"+" "+founderName);
		System.out.println("since"+" "+since);
		System.out.println("employes"+" "+employes);
		System.out.println("address"+" "+address);
		System.out.println("business"+" "+business);
		
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body bgcolor='Green'>")
		.append("<h1>")
		.append("Doing the web Project")
		.append("</h1>")
		.append("</br>")
		.append("name").append(name)
		.append("</br>")
		.append("foundername").append(founderName)
		.append("</br>")
		.append("since").append(since)
		.append("</br>")
		.append("employes").append(employes)
		.append("</br>")
		.append("address").append(address)
		.append("</br>")
		.append("address").append(business)
		.append("</br>")
		.append("</body>")
		.append("</html");
		
		
		CompanyDetailsDTO dto=new CompanyDetailsDTO(name, founderName, since, employes, address, business);
		boolean add = companyDetailsDTOs.add(dto);
		System.out.println(add);
		
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("calling doGet Method ");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		.append("<body bgcolor='yellow'>")
		.append("<head >")
		.append("<style>")
		
		.append("</style>")
		.append("<head>")
		.append("<h3>")
		.append("Company Details")
		.append("</h3>")
		
		.append("<table border='1px' solid black>");
		
		writer.append("<th>")
		.append("Name")
		.append("</th>")
		
		.append("<th>")
		.append("FounderName")
		.append("</th>")
		
		.append("<th>")
		.append("Since")
		.append("</th>")
		
		.append("<th>")
		.append("Employes")
		.append("</th>")
		
		.append("<th>")
		.append("Address")
		.append("</th>")
		
		.append("<th>")
		.append("Business")
		.append("</th>");
		
		for (CompanyDetailsDTO companyDetailsDTO : companyDetailsDTOs) {
			
		writer.append("<tr>")
		.append("<td>")
		.append(companyDetailsDTO.getName())
		.append("</td>")
		
		.append("<td>")
		.append(companyDetailsDTO.getFounderName())
		.append("</td>")
		
		.append("<td>")
		.append(companyDetailsDTO.getSince())
		.append("</td>")
		
		.append("<td>")
		.append(companyDetailsDTO.getEmployes())
		.append("</td>")
		
		.append("<td>")
		.append(companyDetailsDTO.getAddress())
		.append("<td>")
		
		.append("<td>")
		.append(companyDetailsDTO.getBusiness())
		.append("</td>")
		
		.append("</tr>");
		}
		
	writer.append("</table>")
		.append("</body>")
		.append("</html>");
				 
		
	}

}
