package core.Hooks;
import core.generic.StepBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @ScriptName    : Hooks
 * @Description   : This class contains   
 * @Author: Vinayak Shejavale(Harman) @Creation Date : 28 Nov 2017   @Modified Date:                       
 */
public class Hooks 
{
	public Scenario currentScenario;
	StepBase objStepBase = new StepBase();
	@Before
	public void applyHook(Scenario scenario)
	{
		currentScenario = scenario;
		objStepBase.setUp(scenario);
	}

	@After
	public void removeHook(Scenario scenario) 
	{
		objStepBase.tearDown(scenario);
	}	
}
