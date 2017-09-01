package com.fashiongo.cms.model;

public class EditItemSaveResult {
	private ProcedureResult procedureResult;
	private EditItem editItem;
	
	public ProcedureResult getProcedureResult() {
		return procedureResult;
	}
	
	public void setProcedureResult(ProcedureResult procedureResult) {
		this.procedureResult = procedureResult;
	}
	
	public EditItem getEditItem() {
		return editItem;
	}
	
	public void setEditItem(EditItem editItem) {
		this.editItem = editItem;
	}
}
