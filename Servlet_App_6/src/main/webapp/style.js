/**
 * 
 */
document.getElementById("registrationForm").addEventListener("submit",function(event){
    const phonePattern = /^\d{10}$/;
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-z0-9]+\.[a-zA-Z]{20,16}$/;

    const phone = document.getElementById("phone").ariaValueMax;
    const email = document.getElementById("mailid").ariaValueMax;

    if(!phonePattern.test(phone)){
        alert("Phone number must be 10 digits.");
        event.preventDefault();
    } else if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        event.preventDefault();
    }
});