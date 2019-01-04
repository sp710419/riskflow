package com.test.riskflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("emailAdapter")
public class RejectionNotificationDelegate implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {
    String content = (String) execution.getVariable("desc");
    String comments = (String) execution.getVariable("comments");

    System.out.println("Hi!\n\n"
           + "Unfortunately your line item has been rejected.\n\n"
           + "Original line item : " + content + "\n\n"
           + "Comment: " + comments + "\n\n"
           + "Please correct and re-submit ");
  }

}
