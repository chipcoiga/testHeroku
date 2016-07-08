var listItemPrice;

function loadItem(){
	console.log("fsdfssdfs");
}
function openModalAddItem(){
	   $('#modalAddItem').modal('show');
	}
	function addNewItem(){
	   if(!checkIsValidItem()){
	      return;
	   }
	}
	function checkIsValidItem(){
	   var new_item_name = $('#new_item_name');
	   var new_item_cost_before = $('#new_item_cost_before');
	   var new_item_cost_after = $('#new_item_cost_after');

	   var result = true;

	   if(!new_item_name.val()){
	      inValidItem(new_item_name,"invalid");
	      result = false;
	   }else{
	      validItem(new_item_name,"");
	   }

	   if(!isValidItemCostNum(new_item_cost_before.val())){
	      inValidItem(new_item_cost_before,"invalid");
	      result = false;
	   }else{
	      validItem(new_item_cost_before,"");
	   }

	   if(!isValidItemCostNum(new_item_cost_after.val())){
	      inValidItem(new_item_cost_after,"invalid");
	      result = false;
	   }else{
	      validItem(new_item_cost_after,"");
	   }

	}
	function isValidItemCostNum(input){
	   if(input.trim() <= 0 ){
	      return false;
	   }
	   return /^[0-9]+$/.test(input.trim());
	}

	function validItem(element, msg){
	   element.parent().parent().removeClass("has-error");
	   element.parent().next().children().text(msg);
	}
	function inValidItem(element, msg){
	   element.parent().parent().addClass("has-error");
	   element.parent().next().children().text(msg);
	}

	function choose_status_loaditem(){

	}
	function choose_facility_loaditem(){

	}
	function show_update_item(id){
	   $('#modalUpdateItem').modal('show');
	}
	function updateItem(){

	}
	function delete_item_confirm(id){
	   $('#modalDeleteItemConfirm').modal('show');
	}
	function deleteItem(){
	   
	}
	function loadItem(){		
		loadFacilityItemOption();
		if(listFacility.length > 0){
			loadItemPriceToView(listFacility[0].facilityID);
		}		
	}
	function loadItemPriceToView(_facilityID){
		var statusSelected = $('#list_status_item').val();
	}
	function loadFacilityItemOption(){
		$('#list_facility_item').html('');
		if(listFacility.length > 0){
			for(var i = 0 ; i<listFacility.length; i++){
				$('#list_facility_item').append(createFacilityItemOption(listFacility[i].facilityID, listFacility[i].facilityName));
			}
		}
	}
	function createFacilityItemOption(facilityID, facilityName){
		var temp = $("<option>",{
			value:facilityID, text:facilityName
		});
		return temp;
	}
	$(document).ready(function(){
		$.post("getAllProviderItemPrice",{
			
		},function(data){
			if(data){
				listItemPrice = JSON.parse(data).getAllProviderItemPrice;				
			}
		});
	});
