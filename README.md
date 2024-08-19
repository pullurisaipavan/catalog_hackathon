
### Uploading Screenshots to GitHub

Follow these steps to upload screenshots to your GitHub repository:

#### **Step 1: Run Your Program and Take Screenshots**

- **Run the Program:** Run the quiz application as described in the README.
- **Take Screenshots:** Capture screenshots of the program in action using your system’s screenshot tool. Save these screenshots as `.png` or `.jpg` files.

#### **Step 2: Save Screenshots in the Project Directory**

1. **Create a `screenshots/` Folder:**
   - In your project directory, create a folder named `screenshots`.
   - Move the screenshots you took into this folder.

2. **Stage the Screenshot Files:**
   - Open your terminal, navigate to your project directory, and stage the screenshots:
     ```bash
     git add screenshots/
     ```

3. **Commit the Screenshots:**
   - Commit the screenshots with a descriptive message:
     ```bash
     git commit -m "Added quiz screenshots"
     ```

4. **Push the Changes to GitHub:**
   - Push the committed changes (including the screenshots) to your GitHub repository:
     ```bash
     git push origin main
     ```

#### **Step 3: Verify on GitHub**

1. **Check the Repository:**
   - Go to your GitHub repository in your browser.
   - Ensure that the `screenshots/` folder is visible and that it contains your uploaded images.

2. **Update README with Screenshot Links:**
   - In your `README.md`, update the image links in the "Screenshots" section to point to the correct files in the `screenshots/` folder.

   Example:
   ```markdown
   ![Quiz Start]
   ![Correct Answer]
   ![Incorrect Answer]
img: output.png





