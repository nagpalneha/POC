package org.iet.sample.plugin.demo.actionhandler;

import java.io.File;

import com.reallysi.rsuite.api.workflow.WorkflowExecutionContext;
import com.rsicms.projectshelper.workflow.actionhandlers.AbstractNonLeavingActionHandler;

public class LoadPdfActionHandler extends AbstractNonLeavingActionHandler {

	private static final long serialVersionUID = -8549005192871221930L;

	@Override
	public void executeTask(WorkflowExecutionContext workflowJobContext) throws Exception {
		File sourceFilePath = workflowJobContext.getFileWorkflowObject().getFile();
		workflowJobContext.getWorkflowLog().info("We would upload " + sourceFilePath.getAbsolutePath());

	}

}
