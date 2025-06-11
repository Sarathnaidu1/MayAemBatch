package com.adobe.aem.guides.wknd.core.workflows;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.granite.workflow.exec.WorkItem;
import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;

@Component(service = WorkflowProcess.class,immediate = true,enabled = true,property = "process.label=Article10062025")
public class Article implements WorkflowProcess{
    private static final Logger LOG=LoggerFactory.getLogger(Article.class);

    @Override
    public void execute(com.day.cq.workflow.exec.WorkItem workItem, WorkflowSession workflowSession, MetaDataMap MetaDataMap)
            throws WorkflowException {
                 // Getting payload from Workflow - workItem -> workflowData -> payload
        String payloadType = workItem.getWorkflowData().getPayloadType();
            LOG.info("{}: Payload path: {}", payloadType);
           
if (payloadType.equals("JCR_PATH"))

    {
        String path = workItem.getWorkflowData().getPayload().toString();
           LOG.debug("{}: Payload path: {}",  path);
    }

}
}