 # Git Commands

1. ## git init
   
   - This is the command you need to use if you want to start a new empty repository or to reinitialize an existing one in the project root. It will create a .git directory with its subdirectories.
  
    <br>

    > **`git init <project_name>`**
    ### or
    ###
    
    > **`git init <repository_name>`**
<br>

2. ## git add
   
   - This is the command you need to use to stage changed files. You can stage individual files:
  
    <br>

    > **`git add <file_name>`**
    
    ### to add or stage all files
    ###
    > **`git add .`**
<br>

3. ## git status
   
   - The git status command displays the state of the working directory and the staging area. It lets you see which changes have been staged, which haven’t, and which files aren’t being tracked by Git.
  
    ###

    > **`git status`**
<br>

4. ## git diff
   
   - You can use this command to see the unstaged changes on the current branch. Here’s an example of a branch with an edited feature file:

    ###

   - By default git diff will show you any uncommitted changes since the last commit.
  
    ###

    > **`git diff`**
    ###

    - If you want to see the staged changes, run the diff command like this:

    ###

    > **`git diff --staged`**
<br>

5. ## git commit
   
   - This one is probably the most used Git command. After changes are done locally, you can save them by “committing” them. A commit is like a local snapshot of the current state of the branch, to which you can always come back. To create a new commit, type this command:
  
    ###

    > **`git commit -m <message>`**
<br>

6. ## git pull
   
   - Using git pull will fetch all the changes from the remote repository and merge any remote changes in the current local branch.
  
    ###

    > **`git pull <remote_url> <branch_name>`**
<br>

7. ## git push
   
   - This Git command will push the locally committed changes to the remote branch.
  
    ###

    > **`git push <remote_rul> <branch_name>`**
<br>

8. ## git clone
   
   - This command is used for downloading the latest version of a remote project and copying it to the selected location on the local machine.
  
    ###

    > **`git clone <repository_url> or <remote_url>`**
<br>

9. ## git branch

   - This Git command will list all the branches in the repository
  
    ###

    > **`git branch`**
    ###

    - To create a new branch without checking it out

    ###

    > **`git branch <branch_name>`**
    ###

    - To delete a branch

    ###
    
    > **`git branch -d <branch_name>`**
<br>

10. ## git checkout
    
    - You can use the checkout command to switch between the branches that you are currently working on.
  
    ###

    > **`git checkout <branch_name>`**
    ###

    - If you want to create a new branch and switch to it, you can do it by using this command:

    ###

    > **`git checkout -b <branch_name>`**
<br>

11. ## git fetch
    
    - This Git command will get all the updates from the remote repository, including new branches.
  
    ###

    > **`git fetch --all`**
<br>

12. ## git merge
    
    - This Git command is used to combine two branches.
  
    ###

    > **`git merge <branch_name>`**
<br>