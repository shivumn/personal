package com.adobe.aem.guides.wknd.core.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.osgi.service.component.annotations.Reference;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.model.WorkflowModel;

//http://localhost:4503/bin/demopathbasedservlet

@Component(service = Servlet.class,
//configurationPolicy = ConfigurationPolicy.REQUIRE,
		property = { "sling.servlet.methods=" + HttpConstants.METHOD_GET,
				"sling.servlet.paths=" + "/bin/runmodebasedservlet1" })

public class RunModeBasedServlet extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 1L;

	
	private static final Logger LOG = LoggerFactory.getLogger(RunModeBasedServlet.class);
	

	@Reference
	private transient ResourceResolverFactory resourceResolverFactory;
	
	@Override
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
			throws ServletException, IOException {

		

		resp.getWriter().println("Workflow Exxecuted for GIT POUSHsdfsdfds");
	}

}