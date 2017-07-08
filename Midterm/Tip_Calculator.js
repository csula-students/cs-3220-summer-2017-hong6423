function figureTip() {
     var bill = document.forms[0].bill.value;
     var tipPercent = document.forms[0].tip_percent.value;
     var tipAmount = Math.round(bill * ("." + tipPercent));
     var total = Math.round(bill * (1 + "." + tipPercent));
    
     document.forms[0].tip_amount.value = tipAmount.toLocaleString();
     document.forms[0].total.value = total.toLocaleString();
     
}
