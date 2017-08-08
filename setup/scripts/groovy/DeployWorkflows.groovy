
import com.rsicms.groovy.utils.*

// Groovy script to load workflows
// -----------------------------------------------------------------------
def projectDir = new File(setupPath)
def workflowDir = new File(projectDir, "workflow")


rsuite.login()
def wfImporter = new DeployWorkflowUtils(rsuite);
if (workflowDir.exists()){
	wfImporter.importWorkflow(workflowDir)
}
rsuite.logout()
