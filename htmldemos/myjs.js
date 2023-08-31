function validateText(id,errid){
    var nm=document.getElementById(id).value;
    if(nm.trim().length>0){
        document.getElementById(errid).innerHTML="";
        return true;}
    //alert("data cannot empty or spaces");
    document.getElementById(errid).innerHTML="Data cannot be empty!!"
    return false;
}

function validatedata(){
var flag=validateText("uname","erruname");
var flag1=validateText("passwd","errpass");
return flag && flag1;
}