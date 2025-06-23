# 📝 Notes App

A clean, offline **Notes App for Android** built using **Java, Android Studio, and SQLite**.  
Designed for simplicity, privacy, and productivity — allowing users to securely create, view, edit, delete, and search notes, with smooth animations and random color cards for a lively UI experience.

---

## 📱 Features  

- ✍️ Add and save notes  
- 📝 Edit existing notes  
- 🗑️ Delete notes  
- 🔍 Real-time note search with a fully functional search bar  
- 📃 Notes displayed using **RecyclerView**  
- 🎨 **Random background colors for each note card**  
- 🎞️ Smooth RecyclerView item animations  
- 📦 Local data storage using **SQLite**  
- 🔒 **Password lock for privacy and secure app access**  
- Clean and responsive UI  

---

## 🛠️ Tech Stack  

- **Java**
- **Android Studio**
- **XML**
- **RecyclerView**
- **SQLite**
- **SearchView**
- **RecyclerView ItemAnimator**
- **Random Color Generation (Material Colors)**
- **SharedPreferences (for password storage)**
- **Material Design Components**

---

## 📸 Screenshots  

### 🔐 Sign In / Password Lock Screen  
Secure the app with a password lock to protect your private notes.  
![Sign In Screen]([screenshots/signin_screen.png](https://private-user-images.githubusercontent.com/215363317/457927503-b1023b2f-4998-4003-8fb9-a9434a91b28f.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTA2ODU3MTYsIm5iZiI6MTc1MDY4NTQxNiwicGF0aCI6Ii8yMTUzNjMzMTcvNDU3OTI3NTAzLWIxMDIzYjJmLTQ5OTgtNDAwMy04ZmI5LWE5NDM0YTkxYjI4Zi5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYyM1QxMzMwMTZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0wZDI4ZGVhZmNmNjA2NWY0YWE2NTdhMGFmZTQ5YmJlMjY1NTljMDA3YjMwMTEwZGZkODNkNWM4ZGViYTg2NWFhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.eX7cw9eNg2wNQdb1L7onaYMtS3rUtYI7uyeg1yd7y3U))

---

### 🔑 Forgot Password Screen  
Option to recover or reset your password in case you forget it.  
![Forgot Password Screen]([screenshots/forgot_password_screen.png](https://private-user-images.githubusercontent.com/215363317/457927567-3c20b008-2b8a-494c-8585-0624ccc27ecb.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTA2ODU3MTYsIm5iZiI6MTc1MDY4NTQxNiwicGF0aCI6Ii8yMTUzNjMzMTcvNDU3OTI3NTY3LTNjMjBiMDA4LTJiOGEtNDk0Yy04NTg1LTA2MjRjY2MyN2VjYi5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYyM1QxMzMwMTZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jYmQ4Zjc1NmNiMjk0MDJhNTE3Y2NiMWU1YzgxMWI5Y2NmZWRmNjY5ZjdlOGM3YmU3NzgxZmM4NTE4ZTBkM2FhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.nXqpCpOuXSFSapzjCA8V5eV2QkBIiXTugaRabQJC0Hs))

---

### 📃 Notes List Activity  
View all your saved notes with random background colors and smooth animations.  
![Notes List Screen]([screenshots/notes_list_screen.png](https://private-user-images.githubusercontent.com/215363317/457927595-30067012-e50b-48c6-b52d-bbf34a6af26a.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTA2ODU3MTYsIm5iZiI6MTc1MDY4NTQxNiwicGF0aCI6Ii8yMTUzNjMzMTcvNDU3OTI3NTk1LTMwMDY3MDEyLWU1MGItNDhjNi1iNTJkLWJiZjM0YTZhZjI2YS5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYyM1QxMzMwMTZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iOTUyOTAxY2M1Yjc5ZjE4MGZmYzc1YzkxZTg1MDhiOTVlZjQ5OTIzYTllYTQ2YTdjMTEwOWRjYTcxOWEzOWMxJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.F7K0VIVzvDXIw20yOm_MN9dyJIQ3dGohkKCotCoydQU))

---

### ➕ Add New Note Activity  
Create a new note by adding a title and content.  
![Add New Note]([screenshots/add_note_screen.png](https://private-user-images.githubusercontent.com/215363317/457927612-48c823f4-76b4-4770-b946-afd71fef8f97.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTA2ODU3MTYsIm5iZiI6MTc1MDY4NTQxNiwicGF0aCI6Ii8yMTUzNjMzMTcvNDU3OTI3NjEyLTQ4YzgyM2Y0LTc2YjQtNDc3MC1iOTQ2LWFmZDcxZmVmOGY5Ny5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYyM1QxMzMwMTZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mMTAwNzE5ZTllZjYzMTJkZmQ4M2Y0YTRmMmU0OTUwYTFlNjM3YTA0MDI5MzBhMmJlY2JkMDQ5MWJmYzQ5ZTUzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.ZwJ-AksgIawK_Jnf_UoeWGlpgluo__J1VAtnPcYXaqc))

---

### ✏️ Update / Delete Note Activity  
Edit existing notes or delete them permanently from the app.  
![Update Delete Note]([screenshots/update_delete_screen.png](https://private-user-images.githubusercontent.com/215363317/457927634-9462510b-06a2-420e-a6e4-109f5863f9a6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NTA2ODU3MTYsIm5iZiI6MTc1MDY4NTQxNiwicGF0aCI6Ii8yMTUzNjMzMTcvNDU3OTI3NjM0LTk0NjI1MTBiLTA2YTItNDIwZS1hNmU0LTEwOWY1ODYzZjlhNi5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDYyM1QxMzMwMTZaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT01YmZlMzg1MjU2Y2U5MmRkNGZmZjJiMzVkZDk5ZGFkN2U4Y2U0YjY1MTlhZTI3ZDVhMjJlNzk5ZTE0NmI0ZjA2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.ALXD-l_57ybAxLq99TEsghEAzDk5jva0gwrptgWLYPo))


 


---

## 📦 How to Install  

1. Clone the repository:



📬 Connect With Me
💼 LinkedIn  https://www.linkedin.com/feed/update/urn:li:activity:7342897757558370307/
  
