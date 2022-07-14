package com.mit.model;

import java.util.List;

public interface PlanDAO {
	List<PlanDTO> getPlan(CurPageDTO curPageDto);
	
	Long countPlan();

	
	
	
	Long[] getAllPlanNum();
	
	PlanDTO getPlanByPlanNum(String planNum);
	
	List<CompanyDTO> getCompanyInfo(PlanDTO planDto);
	
	int insertOrder(OrderDTO orderDto);
	
	List<UserDTO> getEmpl(UserDTO userDto);
	
	UserDTO getEmailByEmplNum(UserDTO userDto);
	
	OrderDTO getTotalPrice(PlanDTO planDto);
	
	long getRemainQuantity(PlanDTO planDto);
	
	OrderDTO getCurrentOrder(PlanDTO planDto);
}
