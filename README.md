How to run:

1. Fork this repo, you can set up codecov.io for your fork, it'll give you a token.
2. Put your codecov token into `codecov.yml` file.
3. Generate cover reports via `./gradlew clean koverReport`
4. Upload it to codecov.io by executing the following command from the root of the repository (or provide full path):
```
./codecov --file ./build/reports/kover/xml/report.xml
```
5. You'll have to wait a few minutes for codecov.io to process submitted data and calculate coverage
