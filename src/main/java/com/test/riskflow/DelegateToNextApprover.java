package com.test.riskflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;


@Service("riskflowAdapter")
public class DelegateToNextApprover implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {
    String content = (String) execution.getVariable("desc");
    System.out.println("delegated to next approver with commet description : '" + content + "'");
  }

}
