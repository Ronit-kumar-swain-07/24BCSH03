
        function validateForm() {

            let name = document.getElementById("name").value;
            let mobile = document.getElementById("mobile").value;
            let address = document.getElementById("address").value;
            let country = document.getElementById("country").value;
            let email = document.getElementById("email").value;
            let password = document.getElementById("password").value;
            let gender = document.querySelector('input[name="gender"]:checked');

            let mobilePattern = /^[0-9]{10}$/;
            let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;

            if (name == "" || mobile == "" || address == "" || country == "" || email == "" || password == "") {
                alert("All fields must be filled");
                return false;
            }

            if (!gender) {
                alert("Please select gender");
                return false;
            }

            if (!mobile.match(mobilePattern)) {
                alert("Mobile number must be 10 digits");
                return false;
            }

            if (!email.match(emailPattern)) {
                alert("Enter a valid email");
                return false;
            }

            if (password.length < 6 || password.length > 15) {
                alert("Password must be between 6 and 15 characters");
                return false;
            }

            alert("Registration Successful!");
            return true;

        }