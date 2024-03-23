Git Repository Struture
It consists of 4 parts:
1. Working directory
2. Staging Area (or index)
3. Local Repository
4. Central Repository

// Transfers your project form working directory
// to staging area.
git add .

// tranfers your project from staging area
// Local Repository
git commit -m  "your message here"

// tranfers project from local to 
// Central Repository (requires internet)
git push 

// add commmand
git add -A (for all files and folders)
# To add all files only in the current directory
git add .

// status command
The git status commadn is used to show the status of the git repository

// push command
# push current branch command
git push --set-upstream <prev branch name	> <current branch name>