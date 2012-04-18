package com.manoinfoways.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class FileListData {
	public static void main(String[] args)
			throws UnsupportedAudioFileException, IOException {
		File folder = new File("C:\\Users\\kdasika\\Desktop\\MD");
		List<File> list = new ArrayList<File>();
		getFiles(folder, list);
		getFileComponents(list);
	}

	private static List<InboundVoiceFilesData> getFileComponents(List<File> list)
			throws UnsupportedAudioFileException, IOException {

		List<InboundVoiceFilesData> inputVoiceFiles = new ArrayList<InboundVoiceFilesData>();

		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i).toString());
			String strTemp = new String();
			strTemp = list.get(i).toString();
			String filePath = list.get(i).toString();
			if (strTemp.endsWith("txt")) {
				String docId = strTemp.substring(strTemp.lastIndexOf('\\') + 1);
				docId = docId.substring(0, 4);
				strTemp = strTemp.substring(0, strTemp.lastIndexOf("\\"));
				String clinicName = strTemp
						.substring(strTemp.lastIndexOf('\\') + 1);

				AudioFileFormat audioFile = AudioSystem.getAudioFileFormat(list
						.get(i));
				AudioFormat format = audioFile.getFormat();
				long frames = audioFile.getFrameLength();
				double durationInSeconds = (frames + 0.0)
						/ format.getFrameRate();

				System.out.println(clinicName + "     " + docId + "     "
						+ filePath);

				InboundVoiceFilesData vfData = new InboundVoiceFilesData(
						filePath, clinicName, docId, list.get(i).length());
				inputVoiceFiles.add(vfData);
			}
		}
		return inputVoiceFiles;
	}

	private static void getFiles(File folder, List<File> list) {
		folder.setReadOnly();
		File[] files = folder.listFiles();
		for (int j = 0; j < files.length; j++) {
			list.add(files[j]);
			if (files[j].isDirectory())
				getFiles(files[j], list);
		}
	}
}