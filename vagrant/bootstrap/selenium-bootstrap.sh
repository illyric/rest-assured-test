#!/usr/bin/env bash

CHROME_DRIVER_VERSION = 2.42

echo "Installing Java 8..."
sudo apt-get update
sudo apt-get install -y default-jdk

echo "Installing required packages..."
sudo apt-get install -y unzip xvfb libxi6 libgconf-2-4

echo "Installing Chrome..."
wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | sudo apt-key add -
echo 'deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main' | sudo tee /etc/apt/sources.list.d/google-chrome.list
sudo apt-get update > /dev/null
sudo apt-get install -y google-chrome-stable

echo "Downloading the chromedriver executable..."
wget https://chromedriver.storage.googleapis.com/$CHROME_DRIVER_VERSION/chromedriver_linux64.zip