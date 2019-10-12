function validate()
{
    let EmployeeData=document.forms['employeeform'];
    let empPassword=EmployeeData.pass.value;
    let empcPassword=EmployeeData.cpass.value;
    if(empPassword===''&& empcPassword===''){
        return false;
    }
     else if(empcPassword===empPassword)
    {
        alert('sucess');
        return true
    }
    else
    {
        alert('password not matching');
        return false;
    }
}