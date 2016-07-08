
			<div id="item-manage" class="tab-pane fade">

	         <div class="container-fluid">
	            <div class="panel panel-default">
	               <div class="panel-heading" style="text-align: center; font-weight: bold;">
	                     List of item
	                     <div style="float: right;">
	                        <i class="fa fa-plus-square fa-2x" aria-hidden="true"
	                           onclick="openModalAddItem();" title="Add new item"></i>
	                     </div></div>
	               <div class="panel-body">
	                  <!--Top filter-->
	                  <div class="row form-horizontal">
	                     <!--facility-->
	                     <div class="col-lg-5 col-md-5 col-sm-6">
	                        <div class="form-group">
	                           <label class="control-label col-lg-2 col-md-2 col-sm-2" for="list_facility_item">Facility: </label>
	                           <div class="col-sm-10">
	                              <select class="form-control" id="list_facility_item" onchange="choose_facility_loaditem();"></select>
	                           </div>
	                        </div>
	                     </div>
	                     <!--status-->
	                     <div class="col-lg-4 col-md-4 col-sm-5">
	                        <div class="form-group">
	                           <label class="control-label col-lg-2 col-md-2 col-sm-2" for="list_status_item">Status: </label>
	                           <div class="col-sm-10">
	                              <select class="form-control" id="list_status_item" onchange="choose_status_loaditem();">
	                              	<option value="allItem">All item</option>
	                              	<option value="usingItem">Using item</option>
	                              	<option value="notUsingItem">Not using item</option>
	                              </select>
	                           </div>
	                        </div>
	                     </div>
	                  </div>
	
	                  <!--list of item-->
	                  <div class="item-table-header">
	                     <div class="row" style="font-weight: bold;">
	                        <div class="col-lg-1 col-md-1 hidden-sm hidden-xs">No</div>
	                        <div class="col-lg-4 col-md-4">Item</div>
	                        <div class="col-lg-6 col-md-6 row" style="padding-left: 0px;">
		                        <div class="col-lg-6 col-md-6 hidden-sm hidden-xs">Before 6:00 PM</div>
		                        <div class="col-lg-6 col-md-6 hidden-sm hidden-xs">After 6:00 PM</div>
	                        </div>
	                        <div class="col-lg-1 col-md-1">Action</div>
	                     </div>
	                     <hr style="color: black; background-color: black; height: 4px;">
	                  </div>
	                     <div class="item-table-content" id="item-table-content">
	                        <div class="row">
	                           <div class="col-lg-1 col-md-1 "><input type="checkbox"  class="checkbox_itemprice" value="id1"></input></div>
	                           <div class="col-lg-4 col-md-4">Item</div>
	                           <div class="col-lg-6 col-md-6 row" style="padding-left: 0px;">
	                           		<div class="col-lg-6 col-md-6 col-sm-6"><input type="number" class="form-control" placeholder="Before 6:00 PM"></input></div>
	                           		<div class="col-lg-6 col-md-6 col-sm-6"><input type="number" class="form-control" placeholder="After 6:00 PM"></input></div>
	                           </div>
	                           <div class="col-lg-1 col-md-1 list_action_roomtype">
	                           		<span class="hidden-lg hidden-md" style="margin-left:15px;">Action: </span><i class="fa fa-pencil-square-o fa-lg" aria-hidden="true" onclick="openEditRoomType(15);" title="Update roomtype"></i><i class="fa fa-trash fa-lg" aria-hidden="true" onclick="openDeleteRoomType(15,'Dual Room');" title="Delete roomtype"></i></div>
	                        </div>
	                        <hr>
	                        <div class="row">
	                           <div class="col-lg-1 col-md-1 "><input type="checkbox"  class="checkbox_itemprice" value="id1"></input></div>
	                           <div class="col-lg-4 col-md-4">Item</div>
	                           <div class="col-lg-6 col-md-6 row" style="padding-left: 0px;">
	                           		<div class="col-lg-6 col-md-6 col-sm-6"><input type="number" class="form-control" placeholder="Before 6:00 PM"></input></div>
	                           		<div class="col-lg-6 col-md-6 col-sm-6"><input type="number" class="form-control" placeholder="After 6:00 PM"></input></div>
	                           </div>
	                           <div	class="col-lg-1 col-md-1">
	                           		<i class="fa fa-pencil-square-o fa-lg" aria-hidden="true" onclick="show_update_item(148);" title="Update item"></i>
	                           </div>
	                        </div>
	                        <hr>
	                        <div class="row">
	                           <div class="col-lg-1 col-md-1 "><input type="checkbox"  class="checkbox_itemprice" value="id1"></input></div>
	                           <div class="col-lg-4 col-md-4">Item</div>
	                           <div class="col-lg-6 col-md-6 row" style="padding-left: 0px;">
	                           		<div class="col-lg-6 col-md-6 col-sm-6"><input type="number" class="form-control" disabled="disabled" placeholder="Before 6:00 PM"></input></div>
	                           		<div class="col-lg-6 col-md-6 col-sm-6"><input type="number" class="form-control" placeholder="After 6:00 PM"></input></div>
	                           </div>
	                           <div	class="col-lg-1 col-md-1">
	                           		<i class="fa fa-pencil-square-o fa-lg" aria-hidden="true" onclick="show_update_item(148);" title="Update item"></i>
	                           </div>
	                        </div>
	                        <hr>
	                     </div>
	                  </div>
	
	               </div>
	            </div>
	         <!--End List item-->
	
	         <!--Modal add new Item-->
	         <div class="modal fade" id="modalAddItem">
	            <div class="modal-dialog">
	               <div class="modal-content">
	                  <div class="modal-header" style="font-weight: bold; text-align: center;">Create new item</div>
	                  <div class="modal-body">
	                     <form class="form-horizontal" id="addItemForm">
	                        <div class="form-group">
	                           <label class="control-label col-sm-3" for="new_item_name">Item name:</label>
	                           <div class="col-sm-5">
	                              <input type="text" class="form-control" id="new_item_name" placeholder="Item name"></input>
	                           </div>
	                           <div class="col-sm-4">
	                              <small class="help-block"></small>
	                           </div>
	                        </div>
	                        <div class="form-group">
	                           <label class="control-label col-sm-3" for="new_item_cost_before">Before 6:00 PM:</label>
	                           <div class="col-sm-5">
	                              <input type="number" class="form-control" id="new_item_cost_before" placeholder="Cost before 6:00 PM"></input>
	                           </div>
	                           <div class="col-sm-4">
	                              <small class="help-block"></small>
	                           </div>
	                        </div>
	                        <div class="form-group">
	                           <label class="control-label col-sm-3" for="new_item_cost_after">After 6:00 PM:</label>
	                           <div class="col-sm-5">
	                              <input type="number" class="form-control" id="new_item_cost_after" placeholder="Cost after 6:00 PM"></input>
	                           </div>
	                           <div class="col-sm-4">
	                              <small class="help-block"></small>
	                           </div>
	                        </div>
	                     </form>
	                  </div>
	                  <div class="modal-footer">
	                     <button class="btn btn-success"
	                        onclick="addNewItem();">Create</button>
	                     <button class="btn btn-default" data-dismiss="modal">Cancel</button>
	                  </div>
	               </div>
	            </div>           
	        </div>
	        <!--end modal create new-->
	
	        <!--Modal update item-->
	            <div class="modal fade" id="modalUpdateItem">
	               <div class="modal-dialog">
	                  <div class="modal-content">
	                     <div class="modal-header" style="font-weight: bold; text-align: center;">Update item</div>
	                     <div class="modal-body">
	                        <form class="form-horizontal" id="updateItemForm">
	                           <div class="form-group">
	                              <label class="control-label col-sm-3" for="update_item_name">Item name:</label>
	                              <div class="col-sm-5">
	                                 <input type="text" class="form-control" id="update_item_name" placeholder="Item name"></input>
	                              </div>
	                              <div class="col-sm-4">
	                                 <small class="help-block"></small>
	                              </div>
	                           </div>
	                           <div class="form-group">
	                              <label class="control-label col-sm-3" for="update_item_cost_before">Before 6:00 PM:</label>
	                              <div class="col-sm-5">
	                                 <input type="number" class="form-control" id="update_item_cost_before" placeholder="Cost before 6:00 PM"></input>
	                              </div>
	                              <div class="col-sm-4">
	                                 <small class="help-block"></small>
	                              </div>
	                           </div>
	                           <div class="form-group">
	                              <label class="control-label col-sm-3" for="update_item_cost_after">After 6:00 PM:</label>
	                              <div class="col-sm-5">
	                                 <input type="number" class="form-control" id="update_item_cost_after" placeholder="Cost after 6:00 PM"></input>
	                              </div>
	                              <div class="col-sm-4">
	                                 <small class="help-block"></small>
	                              </div>
	                           </div>
	                        </form>
	                     </div>
	                     <div class="modal-footer">
	                        <button class="btn btn-success"
	                        onclick="updateItem();">Save</button>
	                        <button class="btn btn-default" data-dismiss="modal">Cancel</button>
	                     </div>
	                  </div>
	               </div>
	            </div>
	         <!--End modal update item-->
	
	         <div class="modal fade" id="modalDeleteItemConfirm">
	            <div class="modal-dialog">
	               <div class="modal-content">
	                  <div class="modal-header" style="font-weight: bold; text-align: center;">Delete item confirm</div>
	                  <div class="modal-content"></div>
	                  <div class="modal-footer">
	                     <button class="btn btn-d"
	                        onclick="deleteItem();">Create</button>
	                     <button class="btn btn-default" data-dismiss="modal">Cancel</button>
	                  </div>
	               </div>
	            </div>
	         </div>

         </div>
