import{AbstractControl,ValidationErrors} from'@angular/forms';

export class customvalidation{
    static noSpace(control:AbstractControl):ValidationErrors|null{
        if((control.value as String).indexOf(' ')>0)
        {
            return {noSpace:true}
        }
        else{
            return null;
        }
    }
}