package seleniumpractice;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		WebElement file=driver.findElement(By.xpath("//div[contains(@class,' startingup-statistics')]//child::a[text() = 'CSV']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", file);
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", file);
		//file.click();
		Thread.sleep(5000);
		DownloadFile.verifyExcelIsDownloadedAndMoveToProjectLocation("BrowserStack");
	}
		
		public static String verifyExcelIsDownloadedAndMoveToProjectLocation(String fileName) throws IOException {
			String downloadedExcelName = "";
			String fileLocationPathInProject = "";
	 
			try {
	 
				String userName = System.getProperty("user.name");
				String currentDirLocation = System.getProperty("user.dir");
				String defaultpath = "C:\\Users\\"+ userName.toUpperCase() +"\\Downloads";
				downloadedExcelName = getNameOfDownLoadedExcelFile(defaultpath, fileName);
	 System.out.println(userName);
	 System.out.println(currentDirLocation);
	 System.out.println(defaultpath);
				String LocationPath = currentDirLocation + "\\reports";
				System.out.println(LocationPath);
				String DefaultLocationPath = defaultpath + "\\" + downloadedExcelName;
	 System.out.println(DefaultLocationPath);
				File file2 = new File(LocationPath);
	 
				File[] file1 = file2.listFiles();
	 
				String projectReportLocationPath = "";
	 
				for (File file : file1) {
	 
					projectReportLocationPath = file.getAbsolutePath();
					break;
				}
				fileLocationPathInProject = projectReportLocationPath + "\\" + downloadedExcelName;
	 
				moveFileToRequiredLocation(DefaultLocationPath, fileLocationPathInProject);
	 
			} catch (Exception e) {
				
			}
			System.out.println(fileLocationPathInProject);
			return fileLocationPathInProject;
		}
		public static String getNameOfDownLoadedExcelFile(String downloadFolderFilepath, String fileName) {
			String downloadedExcelName = "";
			try {
	 
				File file = new File(downloadFolderFilepath);
				File[] files = file.listFiles();
	 
				for (int i = 0; i < files.length; i++) {
					if (files[i].getName().startsWith(fileName)) {
	 
						downloadedExcelName = files[i].getName();
						break;
					}
				}
			} catch (Exception e) {
				
			}
			return downloadedExcelName;
		}
		public static boolean moveFileToRequiredLocation(String downLoadLocation, String projectLocation) throws IOException {
			boolean status = false;
			try {
				
				Path temp = Files.move(Paths.get(downLoadLocation), Paths.get(projectLocation));
				
				if (temp != null) {
					status = true;
				} else {
					status = false;
				}
			} catch (Exception e) {
				
			}
			return status;
		}

	}


