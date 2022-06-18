1 ,build  Issue
Error: Gradle script '/home/runner/work/NTP_springboot-CI-CD-pipeline/NTP_springboot-CI-CD-pipeline/gradlew' is not executable.

Fix
Added the following lines in Ci.yaml
    - name: Change wrapper permissions
      run: chmod +x ./gradlew