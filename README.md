# AI-Powered-Code-Review
An AI-powered code analysis application that uses an Ollama model to detect bugs, identify performance issues, and provide code improvement suggestions.
<hr>
 🌟 Key Features

- 🔍 **Bug Detection:** Detects bugs and edge cases
- ⚡ **Performance Optimization:** Highlights performance issues
- 💡 **Smart Suggestions:** Suggests actionable improvements
- 📊 **Structured Feedback:** Provides complete breakdown (Summary, Bugs, Performance, Improvements, Rating)
- 🧠 **Multi-Language Support:** Works with Java, Python, JavaScript, and more
<hr>
 🛠️ Tech Stack

| Layer | Technology |
| :--- | :--- |
| **Backend** | Java, Spring Boot |
| **ORM** | Spring Data JPA |
| **Database** | MySQL |
| **AI** | Ollama Model |
| **Editor** | IntelliJ IDEA |
<hr>
 🧠 How It Works

1. 📝 **User enters code** I.
2. 🚀 **Request is sent** to the Spring Boot backend.
3. 🤖 **Backend calls Ollama Model** for local AI processing.
4. 🔍 **AI analyzes code** and returns a structured response.
5. 📊 **Result is displayed**  stored in the MySQL database.

---

## 📁 Project Structure

```text
src/main/java/com/codereview/
├── controller/   # REST controllers 
├── service/      # Business logic & Ollama AI integration
├── repository/   # Spring Data JPA repositories
├── model/        # Entity classes 
├── dto/          # Data Transfer Objects
└── config/       # Application configuration classes
