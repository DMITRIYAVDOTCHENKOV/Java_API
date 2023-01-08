package org.example.lesson5.lesson5HW;
//Учитывая список путей к информации о каталоге, включая путь к каталогу и все файлы с содержимым в этом каталоге,
// верните все дубликаты файлов в файловой системе с точки зрения их путей. Вы можете вернуть ответ в любом порядке.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//        A group of duplicate files consists of at least two files that have the same content.
//
//        A single directory info string in the input list has the following format:
//
//        "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
//        It means there are n files (f1.txt, f2.txt ... fn.txt) with content (f1_content, f2_content ... fn_content)
//        respectively in the directory "root/d1/d2/.../dm". Note that n >= 1 and m >= 0. If m = 0,
//        it means the directory is just the root directory.
//
//        The output is a list of groups of duplicate file paths. For each group,
//        it contains all the file paths of the files that have the same content.
//        A file path is a string that has the following format:
//
//        "directory_path/file_name.txt"
//
//        Example 1:
//
//        Input: paths = ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"]
//        Output: [["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
//        Example 2:
//
//        Input: paths = ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"]
//        Output: [["root/a/2.txt","root/c/d/4.txt"],["root/a/1.txt","root/c/3.txt"]]
public class Task609 {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> contentMap = new HashMap<>();
        for(String cur:paths){
            String[] curlist = cur.split(" ");
            int len = curlist.length;
            for(int i=1;i<len;++i){
                int index = curlist[i].indexOf("(");
                String content = curlist[i].substring(index);
                List<String> templist = contentMap.getOrDefault(content,new ArrayList<>());
                String tempS = curlist[0]+"/"+curlist[i].substring(0,index);
                templist.add(tempS);
                contentMap.put(content,templist);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key:contentMap.keySet()){
            List<String> list = contentMap.get(key);
            if(list.size()<2)continue;
            res.add(list);
        }
        return res;
    }
}
