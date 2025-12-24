# 🍳 Recipefy-Chefbot AI

Welcome to **Recipefy-Chefbot**, an intelligent culinary assistant that inspires your next meal!
This full-stack application generates unique recipes from the ingredients you provide and answers your cooking questions with a conversational AI chef.

---

## 🚀 Live Demo

React App :https://chimerical-wisp-0e018b.netlify.app/

⚠️ *Note: The backend is hosted on a free tier, so the first request may take a few seconds to “wake up” the server.*

---

## ✨ Features

### 🍲 Recipe Generator

* 🥗 Ingredient-Based Creation → Enter a list of comma-separated ingredients
* 🌱 Dietary Customization → Support for restrictions (e.g., *vegetarian*, *gluten-free*)
* 🍝 Cuisine Specification → Request specific cuisines (e.g., *Italian*, *Mexican*)

### 👨‍🍳 ChefBot Assistant / General Purpose

* 💬 Conversational AI → Ask any cooking-related question
* 🧑‍🍳 Expert Knowledge → Cooking techniques, ingredient substitutions, pairings
* 🎉 Creative Inspiration → Meal ideas for special occasions

## 🛠️ Tech Stack & Architecture

### Frontend

* ⚛️ React (SPA)
* 🎨 CSS (responsive & dynamic styling)
* 🌍 Deployed on **Netlify**

### Backend

* ☕ Java & Spring Boot (REST API)
* 📦 Docker containerized
* 🌍 Deployed on **Render**

### Artificial Intelligence

* 🤖 Large Language Model (LLM) via REST API
* 🧠 Natural Language Understanding (NLU) & Text Generation


## 📂 Project Structure

```plaintext
Recipefy-Chefbot/
├── frontend/   # React app
│   ├── src/
│   ├── public/
│   └── package.json
├── backend/    # Spring Boot app
│   ├── src/
│   ├── pom.xml
│   └── Dockerfile
└── README.md
```


## ⚙️ Local Setup

### 🔹 Prerequisites

* **Node.js** ≥ 18
* **Java** 17
* **Maven** 3.9+

### 1. Clone the Repository

```bash
git clone https://github.com/Monishrajpalanivelu/Recipefy-Chefbot.git
cd Recipefy-Chefbot
```

### 2. Setup the Backend (Spring Boot API)

```bash
cd backend
./mvnw spring-boot:run
```

➡ Backend runs at: `http://localhost:8080`

### 3. Setup the Frontend (React App)

```bash
cd frontend
npm install
npm start
```

➡ Frontend runs at: `http://localhost:3000`

### 4. Environment Variables

Create `.env` files in both **frontend** and **backend**:

**Frontend (`frontend/.env`)**

```env
REACT_APP_API_URL=http://localhost:8080
```

**Backend (`backend/.env`)**

```env
AI_API_KEY=your_ai_api_key_here
```

---

## 🧑‍🍳 Usage

### Generate Recipes

1. Open `http://localhost:3000`
2. Go to **Recipe Generator** tab
3. Enter ingredients, dietary needs, or cuisine
4. Click **Create Recipe**

### Chat with ChefBot

1. Go to **ChatBot** tab
2. Ask a cooking-related question
3. Get instant expert advice 🍴


## 📦 Deployment

* **Frontend** → Deployed on [Netlify](https://www.netlify.com/)
* **Backend** → Deployed on [Render](https://render.com/)
* **Containerization** → Docker

