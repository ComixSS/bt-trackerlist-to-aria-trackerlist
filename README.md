# bt-trackerlist-to-aria2-trackerlist
这是一个可以帮助你把bt格式的trackerlist转换成aria2所适用的格式的小程序。
这个程序是我第一个写的有用一点程序。
# 用法
1. 输入bt-tracker所在路径，路径名一定要完整。
例如：/home/username/
2. 输入文件名
例如：filename

以上文件具体路径就为/home/username/filename，转换成功后会在相同路径下生成filename_aria文件。

# 注意事项
由于我用的是一整个长字符串一次性写入文件，所以文件长度不能超过String类型长度限制。
