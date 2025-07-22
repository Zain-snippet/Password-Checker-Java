
# 🔐 CLI Password Checker (Java)
A simple command-line based password validation tool written in Java. This program checks whether the user-entered password meets strong security requirements and gives real-time feedback for improvement.

# ✅ Features
• Validates password based on: 
• Minimum 8 characters in length
• At least one lowercase letter
• At least one uppercase letter
• At least one digit
• At least one special character (e.g. @, #, %, &, etc.)
• Trims and removes spaces before checking
• Loops until a valid password is entered
• User-friendly error messages

# 💻 How It Works
• Prompts the user to enter a password.
• Removes all whitespaces automatically.
• Validates the password based on the above rules.
• Displays specific error messages for missing criteria.
• Repeats until a valid password is entered.

# 📂 Code Overview
// Class Name: PasswordChecker
 // Key Method: checkPassword(String password) 
// Main Loop: Continuously takes input until a valid password is provided 

# 🚀 Getting Started
Requirements
• Java JDK 8 or higher
• Terminal or Command Prompt

# How to Run
• Save the file as PasswordChecker.java
• Compile it: javac PasswordChecker.java 
• Run it: java PasswordChecker 

# 📌 Example Output

Enter password No spaces, spaces are removed by default : abc123 
Error! Password must have at least one capital letter

 Error! Password must have at least one special character ...

 Password entered successful 

# 📎 Notes
• Passwords with whitespace will automatically have all spaces removed.
• You can customize the list of special characters inside the code.

# 🛠 Future Improvements 
• Mask password input
• Add retry limits
• Strength meter or score system
